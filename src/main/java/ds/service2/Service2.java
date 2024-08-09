package ds.service2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class Service2 extends Service2ImplBase {

	// List for storing devices involved in service
	ArrayList<Device> items = new ArrayList<>();

	// Create devices with differing presets
	Device mainlight = Device.newBuilder().setId(101).setName("mainlight").setPower(false).setIntensity((float) (0.0))
			.build();
	Device thermostat = Device.newBuilder().setId(102).setName("thermostat").setPower(true).setIntensity((float) (0.22))
			.build();
	Device ac = Device.newBuilder().setId(103).setName("ac").setPower(true).setIntensity((float) (0.9)).build();
	Device hvac = Device.newBuilder().setId(104).setName("hvac").setPower(false).setIntensity((float) (0.0)).build();
	Device windows = Device.newBuilder().setId(105).setName("windows").setPower(false).setIntensity((float) (0.0))
			.build();
	Device cctv_front = Device.newBuilder().setId(106).setName("cctv_front").setPower(true).setIntensity((float) (1))
			.build();
	Device cctv_back = Device.newBuilder().setId(107).setName("cctv_back").setPower(true).setIntensity((float) (1))
			.build();
	Device frontgate = Device.newBuilder().setId(109).setName("frontgate").setPower(true).setIntensity((float) (1))
			.build();
	Device speaker = Device.newBuilder().setId(110).setName("speaker").setPower(false).setIntensity((float) (0))
			.build();

	// Home base temperature
	float currentDegree = (float) 22.0;

	// Logger
	private static final Logger logger = Logger.getLogger(Service2.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		// Server creation for service1
		Service2 service1 = new Service2();

		// Unique port
		int port = 50052;

		// Assign port to service1 server
		Server server = ServerBuilder.forPort(port).addService(service1).build().start();

		// Running
		logger.info("Service-2 started, listening on " + port);
		server.awaitTermination();

	}

	@Override
	// Set Temperature Method (Server Streaminng)
	public void setTemperature(SetTemperatureRequestMessage request,
			StreamObserver<SetTemperatureResponseMessage> responseObserver) {

		// Adding devices to ArrayList if not yet added
		if (items.size() == 0) {
			items.add(mainlight);
			items.add(thermostat);
			items.add(ac);
			items.add(hvac);
			items.add(windows);
			items.add(cctv_front);
			items.add(cctv_back);
			items.add(frontgate);
			items.add(speaker);
		}

		// Temperature desired
		float desiredDegree = (float) request.getDegree();

		// New temperature returned for GUI
		String degreeMsg = String.valueOf(desiredDegree);
		SetTemperatureResponseMessage reply = SetTemperatureResponseMessage.newBuilder().setItem(degreeMsg).build();
		responseObserver.onNext(reply);

		int preSize = items.size();

		// Determining whether home is to be cooled or heated

		// Temperature the same
		// Check current temperature with thermostat (ID 102)
		for (int i = 0; i < preSize; i++) {
			if (items.get(i).getId() == 102) {
				// Constructing response message of changed device
				float temp = items.get(i).getIntensity();
				if (temp == desiredDegree) {
					// Send response
					String str = "Temperature unchanged";
					SetTemperatureResponseMessage tempMsg = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(tempMsg);
					// No More responses
					responseObserver.onCompleted();
					return;
				}
			}
		}

		// Heat home
		if (desiredDegree > currentDegree) {
			String str = "Home to be heated";
			SetTemperatureResponseMessage heated = SetTemperatureResponseMessage.newBuilder().setItem(str).build();
			// Returning message to client
			responseObserver.onNext(heated);

			// Changing device parameters
			// Change Thermostat (ID102)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 102) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + true;
					str += " , Intensity: " + desiredDegree + "}";

					// Send response
					SetTemperatureResponseMessage replyT = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(replyT);

					// Replace current device
					Device thermostatNew = Device.newBuilder().setId(102).setName("thermostat").setPower(true)
							.setIntensity((float) (desiredDegree)).build();
					items.remove(i);
					items.add(thermostatNew);
					break;
				}
			}
			// Change AC (ID103)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 103) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + false;
					str += " , Intensity: " + 0 + "}";

					// Send response
					SetTemperatureResponseMessage acNew = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(acNew);

					// Replace current device
					Device ac = Device.newBuilder().setId(103).setName("ac").setPower(false).setIntensity((float) (0))
							.build();
					items.remove(i);
					items.add(ac);
					break;
				}
			}
			// Change HVAC (ID104)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 104) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + true;
					str += " , Intensity: " + 0.87 + "}";

					// Send response
					SetTemperatureResponseMessage hvacNew = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(hvacNew);

					// Replace current device
					Device hvac = Device.newBuilder().setId(104).setName("hvac").setPower(true)
							.setIntensity((float) (0.87)).build();
					items.remove(i);
					items.add(hvac);
					break;
				}
			}
			// Change Windows (ID105)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 105) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + false;
					str += " , Intensity: " + 0 + "}";

					// Send response
					SetTemperatureResponseMessage windowsNew = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(windowsNew);

					// Replace current device
					Device windows = Device.newBuilder().setId(105).setName("windows").setPower(false)
							.setIntensity((float) (0)).build();
					items.remove(i);
					items.add(windows);
					break;
				}
			}
			// No More responses
			responseObserver.onCompleted();

			// Cool home
		} else if (desiredDegree < currentDegree) {
			String str = "Home to be cooled";
			SetTemperatureResponseMessage cooled = SetTemperatureResponseMessage.newBuilder().setItem(str).build();
			// Returning message to client
			responseObserver.onNext(cooled);

			// Changing device parameters
			// Change Thermostat (ID102)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 102) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + true;
					str += " , Intensity: " + desiredDegree + "}";

					// Send response
					SetTemperatureResponseMessage replyT = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(replyT);

					// Replace current device
					Device thermostatNew = Device.newBuilder().setId(102).setName("thermostat").setPower(true)
							.setIntensity((float) (desiredDegree)).build();
					items.remove(i);
					items.add(thermostatNew);
					break;
				}
			}
			// Change AC (ID103)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 103) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + true;
					str += " , Intensity: " + 0.72 + "}";

					// Send response
					SetTemperatureResponseMessage acNew = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(acNew);

					// Replace current device
					Device ac = Device.newBuilder().setId(103).setName("ac").setPower(true).setIntensity((float) (0.72))
							.build();
					items.remove(i);
					items.add(ac);
					break;
				}
			}
			// Change HVAC (ID104)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 104) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + false;
					str += " , Intensity: " + 0.0 + "}";

					// Send response
					SetTemperatureResponseMessage hvacNew = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(hvacNew);

					// Replace current device
					Device hvac = Device.newBuilder().setId(104).setName("hvac").setPower(false)
							.setIntensity((float) (0)).build();
					items.remove(i);
					items.add(hvac);
					break;
				}
			}
			// Change Windows (ID105)
			for (int i = 0; i < preSize; i++) {
				if (items.get(i).getId() == 105) {
					// Constructing response message of changed device
					str = "Changed device: {ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += " , Power: " + true;
					str += " , Intensity: " + 0 + "}";

					// Send response
					SetTemperatureResponseMessage windowsNew = SetTemperatureResponseMessage.newBuilder().setItem(str)
							.build();
					responseObserver.onNext(windowsNew);

					// Replace current device
					Device windows = Device.newBuilder().setId(105).setName("windows").setPower(true)
							.setIntensity((float) (0)).build();
					items.remove(i);
					items.add(windows);
					break;
				}
			}
			// No More responses
			responseObserver.onCompleted();
		}
	}

	// Humidify Method (Bidirectional Streaminng)
	@Override
	public StreamObserver<HumidifyRequestMessage> dehumidify(StreamObserver<HumidifyResponseMessage> responseObserver) {
		return new StreamObserver<HumidifyRequestMessage>() {

			// New values of attributes to be changed
			int count;
			String[] attributes = new String[3];
			


			@Override
			public void onNext(HumidifyRequestMessage value) {
				attributes[count] = value.getItem();
				count++;
			}

			@Override
			public void onError(Throwable t) {
				logger.info(t.getLocalizedMessage());

			}

			@Override
			public void onCompleted() {
				try {
					// Alter devices with newly recieved attributes
					float hvacIntensity = Float.parseFloat(attributes[0]);
					float acIntensity = Float.parseFloat(attributes[1]);
					float windowsIntensity = Float.parseFloat(attributes[2]);

					// Create response messages

					HumidifyResponseMessage hvac = HumidifyResponseMessage.newBuilder()
							.setItem("HVAC intensity changed to " + hvacIntensity).build();
					HumidifyResponseMessage ac = HumidifyResponseMessage.newBuilder()
							.setItem("AC intensity changed to " + acIntensity).build();
					HumidifyResponseMessage windows = HumidifyResponseMessage.newBuilder()
							.setItem("Windows ventilation intensity changed to " + windowsIntensity).build();

					// Returning message to client
					responseObserver.onNext(hvac);
					responseObserver.onNext(ac);
					responseObserver.onNext(windows);
					
					// No more messages
					responseObserver.onCompleted();
					logger.info("SUCCESS: Dehumidify preset employed");

				} catch (RuntimeException er) {
					logger.info(er.getMessage());
				}
			}
		};
	}

	// Preset Method (Bidirectional Streaminng)
	@Override
	public StreamObserver<PresetRequestMessage> preset(StreamObserver<PresetResponseMessage> responseObserver) {
		return new StreamObserver<PresetRequestMessage>() {

			// New values of attributes to be changed
			int count;
			String[] attributes = new String[8];

			@Override
			public void onNext(PresetRequestMessage value) {
				attributes[count] = value.getItem();
				count++;
			}

			@Override
			public void onError(Throwable t) {
				logger.info(t.getLocalizedMessage());

			}

			@Override
			public void onCompleted() {
				try {
					// Alter devices with newly recieved attributes
					boolean speakerPower = Boolean.parseBoolean(attributes[0]);
					float speakerIntensity = Float.parseFloat(attributes[1]);
					boolean cctv_frontPower = Boolean.parseBoolean(attributes[2]);
					float cctv_frontIntensity = Float.parseFloat(attributes[3]);
					boolean cctv_backPower = Boolean.parseBoolean(attributes[4]);
					float cctv_backIntensity = Float.parseFloat(attributes[5]);
					boolean frontgatePower = Boolean.parseBoolean(attributes[6]);
					float mainlightIntensity = Float.parseFloat(attributes[7]);

					// Create response messages
					PresetResponseMessage speakerP = PresetResponseMessage.newBuilder()
							.setItem("Speaker power: " + speakerPower).build();
					PresetResponseMessage speakerI = PresetResponseMessage.newBuilder()
							.setItem("Speaker intensity changed to " + speakerIntensity).build();
					PresetResponseMessage cctv_frontP = PresetResponseMessage.newBuilder()
							.setItem("CCTV_Front power:" + cctv_frontPower).build();
					PresetResponseMessage cctv_frontI = PresetResponseMessage.newBuilder()
							.setItem("CCTV_Front intensity changed to " + cctv_frontIntensity).build();
					PresetResponseMessage cctv_backP = PresetResponseMessage.newBuilder()
							.setItem("CCTV_Back power:" + cctv_backPower).build();
					PresetResponseMessage cctv_backI = PresetResponseMessage.newBuilder()
							.setItem("CCTV_Back intensity changed to " + cctv_backIntensity).build();
					PresetResponseMessage frontgateP = PresetResponseMessage.newBuilder()
							.setItem("Frontgate power: " + frontgatePower).build();
					PresetResponseMessage mainlightI = PresetResponseMessage.newBuilder()
							.setItem("Mainlight intensity changed to: " + mainlightIntensity).build();

					// Returning message to client
					responseObserver.onNext(speakerP);
					responseObserver.onNext(speakerI);
					responseObserver.onNext(cctv_frontP);
					responseObserver.onNext(cctv_frontI);
					responseObserver.onNext(cctv_backP);
					responseObserver.onNext(cctv_backI);
					responseObserver.onNext(frontgateP);
					responseObserver.onNext(mainlightI);


					// No more messages
					responseObserver.onCompleted();
					logger.info("SUCCESS: Preset employed");

				} catch (RuntimeException er) {
					logger.info(er.getMessage());
					throw new RuntimeException();
				}
			}
		};
	}
}