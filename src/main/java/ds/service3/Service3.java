package ds.service3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import ds.service3.Service3Grpc.Service3ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service3 extends Service3ImplBase {

	// List for storing devices involved in services
	ArrayList<MotionSensor> motionsensors = new ArrayList<>();
	ArrayList<Camera> cameras = new ArrayList<>();

	// Create motion sensors with differing presets
	MotionSensor ms1 = MotionSensor.newBuilder().setId(1).setLocation("motionsensor_front_garden").setPower(false)
			.setActivity("03:19").setActivity2("23:50").build();
	MotionSensor ms2 = MotionSensor.newBuilder().setId(2).setLocation("motionsensor_back_garden").setPower(false)
			.setActivity("03:21").setActivity2("17:51").build();
	MotionSensor ms3 = MotionSensor.newBuilder().setId(3).setLocation("motionsensor_safe").setPower(false)
			.setActivity("03:29").setActivity2("23:52").build();
	MotionSensor ms4 = MotionSensor.newBuilder().setId(4).setLocation("motionsensor_kitchen").setPower(true)
			.setActivity("13:22").setActivity2("11:39").build();
	MotionSensor ms5 = MotionSensor.newBuilder().setId(5).setLocation("motionsensor_living_room").setPower(true)
			.setActivity("13:21").setActivity2("12:44)").build();
	MotionSensor ms6 = MotionSensor.newBuilder().setId(6).setLocation("motionsensor_bedroom").setPower(true)
			.setActivity("14:04").setActivity2("13:01").build();
	MotionSensor ms7 = MotionSensor.newBuilder().setId(7).setLocation("motionsensor_main_hall").setPower(true)
			.setActivity("03:37").setActivity2("02:53").build();

	// List for storing cameras involved in service
	Camera c1 = Camera.newBuilder().setId(201).setView("The back window looks damaged").build();
	Camera c2 = Camera.newBuilder().setId(202).setView("A van is parked outside of the front yard").build();
	Camera c3 = Camera.newBuilder().setId(203).setView("Dirty footprints are throughout the room").build();

	// Logger
	private static final Logger logger = Logger.getLogger(Service3.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {

		// Server creation for service3
		Service3 service1 = new Service3();

		// Unique port
		int port = 50053;

		// Assign port to service3 server
		Server server = ServerBuilder.forPort(port).addService(service1).build().start();

		// Running
		logger.info("Service-3 started, listening on " + port);
		server.awaitTermination();
		

	}

	@Override
	// Motion Sensor Activity Method (Server Streaming)
	public void motion(MotionRequestMessage request, StreamObserver<MotionResponseMessage> responseObserver) {

		// Adding motion senors to ArrayList if not yet added
		if (motionsensors.size() == 0) {
			motionsensors.add(ms1);
			motionsensors.add(ms2);
			motionsensors.add(ms3);
			motionsensors.add(ms4);
			motionsensors.add(ms5);
			motionsensors.add(ms6);
			motionsensors.add(ms7);
		}
		// Prepare the item to be sent back
		int id = request.getId();
		int i = 0;
		int matchid = 0;
		logger.info("Activity request recieved for Motion Sensor ID " + id);

		// If no ID entered
//			if (id++ == 0) {
//				InspectResponseMessage reply = InspectResponseMessage.newBuilder().setItem("Enter ID of device to insepect")
//						.build();
//				// Returning message to client
//				responseObserver.onNext(reply);
//				// Log message
//				logger.info("FAILURE: Enter valid ID");
//				// No more responses
//				// No more responses
//				responseObserver.onCompleted();
//				throw new RuntimeException();
//			}
		// Traversee devices to match ID
		while (i < motionsensors.size() && matchid != id) {
			matchid = motionsensors.get(i).getId();
			if (matchid == id) {
				MotionSensor MatchedMotionSensor = motionsensors.get(i);
				// Return matched device info
				String str = "{ID: " + MatchedMotionSensor.getId();
				str += " , Item: " + MatchedMotionSensor.getLocation();
				str += " , Power: " + MatchedMotionSensor.getPower() + "}";
				// Prepare return message with string of device info
				MotionResponseMessage reply = MotionResponseMessage.newBuilder().setReport(str).build();
				// Returning message to client
				responseObserver.onNext(reply);

				// Return recent activity
				str = "Last Activity 1/2: {" + MatchedMotionSensor.getActivity() + "}";
				reply = MotionResponseMessage.newBuilder().setReport(str).build();
				// Returning message to client
				responseObserver.onNext(reply);
				str = "Last Activity 2/2: {" + MatchedMotionSensor.getActivity2() + "}";
				reply = MotionResponseMessage.newBuilder().setReport(str).build();
				// Returning message to client
				responseObserver.onNext(reply);

				// Log message
				logger.info("SUCCESS: Activity check complete");
				// No more responses
				responseObserver.onCompleted();
				break;
			}
			i++;
			// If id not in list
			if (i == motionsensors.size()) {
				MotionResponseMessage reply = MotionResponseMessage.newBuilder()
						.setReport("No match for Motion Sensor ID").build();
				responseObserver.onNext(reply);
				// Log message
				logger.info("FAILURE: Enter valid ID");
				// No more responses
				responseObserver.onCompleted();
				throw new RuntimeException();
			}
		}
	}

	@Override
	// Camera Access Method (Unary)
	public void camera(CameraRequestMessage request, StreamObserver<CameraResponseMessage> responseObserver) {

		// Adding cameras to ArrayList if not yet added
		if (cameras.size() == 0) {
			cameras.add(c1);
			cameras.add(c2);
			cameras.add(c3);
		}
		// Prepare the item to be sent back
		int id = request.getId();
		int i = 0;
		int matchid = 0;
		logger.info("Activity request recieved for Camera ID " + id);

		// Traversee devices to match ID
		while (i < cameras.size() && matchid != id) {
			matchid = cameras.get(i).getId();
			if (matchid == id) {
				Camera MatchedCamera = cameras.get(i);
				// Return matched device info
				String str = "{ID: " + MatchedCamera.getId();
				str += " , Activity: " + MatchedCamera.getView() + "}";
				// Prepare return message with string of device info
				CameraResponseMessage reply = CameraResponseMessage.newBuilder().setActivity(str).build();
				// Returning message to client
				responseObserver.onNext(reply);
				// Log message
				logger.info("SUCCESS: Activity check complete");
				// No more responses
				responseObserver.onCompleted();
				break;
			}
			i++;
			// If id not in list
			if (i == cameras.size()) {
				CameraResponseMessage reply = CameraResponseMessage.newBuilder().setActivity("No match for Camera ")
						.build();
				responseObserver.onNext(reply);
				// Log message
				logger.info("FAILURE: Enter valid ID");
				// No more responses
				responseObserver.onCompleted();
				throw new RuntimeException();
			}
		}
	}

	@Override
	// Dimness Alteration Method (Server Streaming)
	public void dim(DimRequestMessage request, StreamObserver<DimResponseMessage> responseObserver) {

		// Values used in altering dimness
		float currentDimness = (float) 0;
		int dimnessValue = (int) (request.getDimness());
		float dimnessFValue = (float) dimnessValue;
		// Preset value of mainlight intesity
		int mainlightValue = 57;
		float mainlightFValue = (float) (mainlightValue / 100);

		try {
			logger.info("Dimness alteration request recieved.");
			logger.info("Atlering dimness from to " + dimnessFValue);

			// If value exceeds range
			if (dimnessValue < 0 || dimnessValue > 100) {
				DimResponseMessage reply = DimResponseMessage.newBuilder()
						.setResult("FAILURE: Ensure dimness intensity is within valid range").build();
				// Returning message to client
				responseObserver.onNext(reply);
				// Log message
				logger.info("FAILURE: Ensure dimness intensity is within valid range");
				// No more responses
				responseObserver.onCompleted();
				throw new RuntimeException();
			}
			// Preparing dimness message to return to user
			String str = "Changing window dimness intensity from " + currentDimness + " to " + dimnessFValue;
			// Updating new dimness
			currentDimness = dimnessFValue;
			// Sending dimness message
			DimResponseMessage reply = DimResponseMessage.newBuilder().setResult(str).build();
			// Return window dimness message to client
			responseObserver.onNext(reply);

			// Altering mainlight intensity according to new dimness
			float difference = (mainlightValue - currentDimness) / 100;

			if (difference < 0) {
				difference = 0;
			}
			if (difference > 1) {
				difference = 1;
			}
			str = "Changing mainlight intensity from " + mainlightFValue + " to " + difference;
			// Updating new mainlight
			mainlightFValue = difference;
			reply = DimResponseMessage.newBuilder().setResult(str).build();
			// Return mainlight alteration message to client
			responseObserver.onNext(reply);

			// Log message
			logger.info("SUCCESS: Dimness alteration complete");
			// No more responses
			responseObserver.onCompleted();
		} catch (RuntimeException er) {
			logger.info(er.getMessage());
			throw new RuntimeException();
		}
	}
}