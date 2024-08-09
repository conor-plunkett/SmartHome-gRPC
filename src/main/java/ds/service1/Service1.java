package ds.service1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;
import ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
//import io.grpc.alts.AltsServerBuilder;

public class Service1 extends Service1ImplBase {

	// List for storing devices involved in service
	ArrayList<Device> items = new ArrayList<>();

	// Create devices with differing presets
	Device lamp = Device.newBuilder().setId(100).setName("lamp").setPower(true).setIntensity((float) (0.93)).build();
	Device mainlight = Device.newBuilder().setId(101).setName("mainlight").setPower(true).setIntensity((float) (0.57))
			.build();
	Device thermostat = Device.newBuilder().setId(102).setName("thermostat").setPower(true).setIntensity((float) (0.23))
			.build();
	Device ac = Device.newBuilder().setId(103).setName("ac").setPower(true).setIntensity((float) (0.9)).build();
	Device hvac = Device.newBuilder().setId(104).setName("hvac").setPower(false).setIntensity((float) (0.0)).build();
	Device windows = Device.newBuilder().setId(105).setName("windows").setPower(false).setIntensity((float) (0.0))
			.build();
	Device fridge = Device.newBuilder().setId(108).setName("fridge").setPower(true)
			.setIntensity((float) (1)).build();
	Device frontgate = Device.newBuilder().setId(109).setName("frontgate").setPower(true).setIntensity((float) (1))
			.build();
	Device speaker = Device.newBuilder().setId(109).setName("speaker").setPower(false).setIntensity((float) (0))
			.build();
	Device motionsensor_front_garden = Device.newBuilder().setId(1).setName("motionsensor_front_garden").setPower(false).setIntensity((float) (0))
			.build();
	Device motionsensor_back_garden = Device.newBuilder().setId(2).setName("motionsensor_back_garden").setPower(false).setIntensity((float) (0))
			.build();
	Device motionsensor_safe = Device.newBuilder().setId(3).setName("motionsensor_safe").setPower(false).setIntensity((float) (0))
			.build();
	Device motionsensor_kitchen = Device.newBuilder().setId(4).setName("motionsensor_kitchen").setPower(true).setIntensity((float) (1))
			.build();
	Device motionsensor_living_room = Device.newBuilder().setId(5).setName("motionsensor_living_room").setPower(true).setIntensity((float) (1))
			.build();
	Device motionsensor_bedroom = Device.newBuilder().setId(6).setName("motionsensor_bedroom").setPower(true).setIntensity((float) (1))
			.build();
	Device motionsensor_main_hall = Device.newBuilder().setId(7).setName("motionsensor_main_hall").setPower(true).setIntensity((float) (1))
			.build();
	Device cctv_front = Device.newBuilder().setId(201).setName("cctv_front").setPower(true).setIntensity((float) (1))
			.build();
	Device cctv_back = Device.newBuilder().setId(202).setName("cctv_back").setPower(true).setIntensity((float) (1))
			.build();
	Device cctv_hallway = Device.newBuilder().setId(203).setName("cctv_hallway").setPower(true).setIntensity((float) (1))
			.build();

	// Logger
	private static final Logger logger = Logger.getLogger(Service1.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// Server creation for service1
		Service1 service1 = new Service1();

		// Unique port
		int port = 50051;

		// Assign port to service1 server
		Server server = ServerBuilder.forPort(port).addService(service1).build().start();
		
		// Running
		logger.info("Service-1 started, listening on " + port);
		
		server.awaitTermination();

	}

	// Inspect Method (Unary)
	@Override
	public void inspect(InspectRequestMessage request, StreamObserver<InspectResponseMessage> responseObserver) {

		// Adding devices to ArrayList if not yet added
		if (items.size() == 0) {
			items.add(lamp);
			items.add(mainlight);
			items.add(thermostat);
			items.add(ac);
			items.add(hvac);
			items.add(windows);
			items.add(fridge);
			items.add(frontgate);
			items.add(motionsensor_front_garden);
			items.add(motionsensor_back_garden);
			items.add(motionsensor_safe);
			items.add(motionsensor_kitchen);
			items.add(motionsensor_living_room);
			items.add(motionsensor_bedroom);
			items.add(motionsensor_main_hall);	
			items.add(cctv_front);
			items.add(cctv_front);
			items.add(cctv_hallway);
		}

		// Prepare the value to be sent back
		int id = request.getId();
		int i = 0;
		int matchid = 0;
		logger.info("Inspection request recieved for ID " + id);

		// Traversee devices to match ID
		while (i < items.size() && matchid != id) {
			System.out.println(id);
			matchid = items.get(i).getId();
			if (matchid == id) {
				Device MatchedDevice = items.get(i);
				// Return matched device info
				String str = "{ID: " + MatchedDevice.getId();
				str += " , Item: " + MatchedDevice.getName();
				str += " , Power: " + MatchedDevice.getPower();
				str += " , Intensity: " + MatchedDevice.getIntensity() + "}";
				// Prepare return message with string of device info
				InspectResponseMessage reply = InspectResponseMessage.newBuilder().setItem(str).build();
				// Returning message to client
				responseObserver.onNext(reply);
				// Log message
				logger.info("SUCCESS: Device inspection complete");
				// No more responses
				responseObserver.onCompleted();
				break;			
			}
			i++;
			
			// If id not in list
			if (i == items.size()) {
				InspectResponseMessage reply = InspectResponseMessage.newBuilder().setItem("No match for ID").build();
				responseObserver.onNext(reply);
				// Log message
				logger.info("FAILURE: Enter valid ID");
				// No more responses
				responseObserver.onCompleted();
				throw new RuntimeException();
			}
		}
	}

	// List Method (Server Streaming)
	@Override
	public void listdevicesconnected(ListRequestMessage request,
			StreamObserver<ListResponseMessage> responseObserver) {

		// Adding devices to ArrayList if not yet added
		if (items.size() == 0) {
			items.add(lamp);
			items.add(mainlight);
			items.add(thermostat);
			items.add(ac);
			items.add(hvac);
			items.add(windows);
			items.add(fridge);
			items.add(frontgate);
			items.add(motionsensor_front_garden);
			items.add(motionsensor_back_garden);
			items.add(motionsensor_safe);
			items.add(motionsensor_kitchen);
			items.add(motionsensor_living_room);
			items.add(motionsensor_bedroom);
			items.add(motionsensor_main_hall);	
			items.add(cctv_front);
			items.add(cctv_front);
			items.add(cctv_hallway);
		}


		// Prepare the value to be set back
		int i = 0;
		logger.info("List request for devices");

		// Retrieve the value from the request of the client and convert it to array
		while (i < items.size()) {
			Device MatchedDevice = items.get(i);
			// Return matched device info
			String str = "{ID: " + MatchedDevice.getId();
			str += " , Item: " + MatchedDevice.getName();
			str += " , Power: " + MatchedDevice.getPower();
			str += " , Intensity: " + MatchedDevice.getIntensity() + "}";
			// Prepare return message with string of device info
			ListResponseMessage reply = ListResponseMessage.newBuilder().setItem(str).build();
			// Returning message to client
			responseObserver.onNext(reply);
			// Repeating for each device
			i++;
		}
		// Log message
		logger.info("SUCCESS: Devices listed");
		// No more responses
		responseObserver.onCompleted();
	}

	// Delete Method (Server Streaming)
	@Override
	public void delete(DeleteRequestMessage request, StreamObserver<DeleteResponseMessage> responseObserver) {
		// Adding devices to ArrayList if not yet added
		// Adding devices to ArrayList if not yet added
		if (items.size() == 0) {
			items.add(lamp);
			items.add(mainlight);
			items.add(thermostat);
			items.add(ac);
			items.add(hvac);
			items.add(windows);
			items.add(fridge);
			items.add(frontgate);
			items.add(motionsensor_front_garden);
			items.add(motionsensor_back_garden);
			items.add(motionsensor_safe);
			items.add(motionsensor_kitchen);
			items.add(motionsensor_living_room);
			items.add(motionsensor_bedroom);
			items.add(motionsensor_main_hall);	
			items.add(cctv_front);
			items.add(cctv_front);
			items.add(cctv_hallway);	
		}


		// Prepare the value to be sent back
		int id = request.getId();

		int i = 0;
		int matchid = 0;
		logger.info("Deletion request recieved for ID " + id);

		// If no ID entered
		if (id == 0) {
			DeleteResponseMessage reply = DeleteResponseMessage.newBuilder().setItem("FAILURE: Enter ID of device to delete")
					.build();
			// Returning message to client
			responseObserver.onNext(reply);
			// Log message
			logger.info("FAILURE: Enter valid ID");
			// No more responses
			responseObserver.onCompleted();
			throw new RuntimeException();
		}

		// List size pre deletion
		int count = items.size();
		DeleteResponseMessage reply = DeleteResponseMessage.newBuilder().setItem("Device count pre deletion: " + count)
				.build();
		responseObserver.onNext(reply);

		// Traverse devices to match ID
		while (i < items.size() && matchid != id) {
			matchid = items.get(i).getId();
			if (matchid == id) {
				Device MatchedDevice = items.get(i);
				// Prepare message of device to be deleted
				String str = "Deleted device: {ID: " + MatchedDevice.getId();
				str += " , Item: " + MatchedDevice.getName();
				str += " , Power: " + MatchedDevice.getPower();
				str += " , Intensity: " + MatchedDevice.getIntensity() + "}";

				// Prepare return message with string of device info
				reply = DeleteResponseMessage.newBuilder().setItem(str).build();
				// Remove device
				items.remove(i);
				// Returning message to client
				responseObserver.onNext(reply);
				// Log message
				logger.info("SUCCESS: Device removal complete");
				// No more responses

				// List size post deletion
				count = items.size();
				reply = DeleteResponseMessage.newBuilder().setItem("Device count post deletion: " + count).build();
				responseObserver.onNext(reply);

				// No more messages
				responseObserver.onCompleted();
				break;
			}
			i++;
			// If list traversed and no match found
			if (i == items.size()) {
				reply = DeleteResponseMessage.newBuilder().setItem("No match for ID. No deletion.").build();
				responseObserver.onNext(reply);
				logger.info("FAILURE: No match for ID");
				// No more responses
				responseObserver.onCompleted();
				throw new RuntimeException();
			}
		}
	}

	// Create Method (Client Streaming)
	@Override
	public StreamObserver<CreateRequestMessage> create(StreamObserver<CreateResponseMessage> responseObserver) {

		return new StreamObserver<CreateRequestMessage>() {
			// Variables for new device
			String name;
			int id;
			int count;
			String[] attributes = new String[] { null, null };

			@Override
			public void onNext(CreateRequestMessage item) {
				attributes[count] = item.getItem();
				count++;
			}

			@Override
			public void onCompleted() {
				try {
					items.size();
					id = Integer.parseInt(attributes[0]);
					name = attributes[1];
					Device newDevice = Device.newBuilder().setId(id).setName(name).setPower(false)
							.setIntensity((float) (0.0)).build();
					items.add(newDevice);
					responseObserver.onNext(CreateResponseMessage.newBuilder()
							.setItem("Created device with attrbiutes " + attributes[0] + ", " + attributes[1]).build());
					responseObserver.onCompleted();
					logger.info("SUCCESS: Device creation complete");

				} catch (NumberFormatException er) {
					logger.info(er.getMessage());
				}
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				logger.info(t.getLocalizedMessage());

			}

		};
	}
	
	// Power Method (Unary)
	@Override
	public void power(PowerRequestMessage request, StreamObserver<PowerResponseMessage> responseObserver) {

		// Adding devices to ArrayList if not yet added
		// Adding devices to ArrayList if not yet added
		if (items.size() == 0) {
			items.add(lamp);
			items.add(mainlight);
			items.add(thermostat);
			items.add(ac);
			items.add(hvac);
			items.add(windows);
			items.add(fridge);
			items.add(frontgate);
			items.add(motionsensor_front_garden);
			items.add(motionsensor_back_garden);
			items.add(motionsensor_safe);
			items.add(motionsensor_kitchen);
			items.add(motionsensor_living_room);
			items.add(motionsensor_bedroom);
			items.add(motionsensor_main_hall);	
			items.add(cctv_front);
			items.add(cctv_front);
			items.add(cctv_hallway);	
		}


		// Prepare the value to be sent back
		int id = request.getId();
		int i = 0;
		int matchid = 0;
		boolean prepower;
		logger.info("Powering request recieved for ID " + id);

		// If no ID entered
		if (id == 0) {
			PowerResponseMessage reply = PowerResponseMessage.newBuilder().setItem("FAILURE: Enter ID of device to power on/off")
					.build();
			// Returning message to client
			responseObserver.onNext(reply);
			// Log message
			logger.info("FAILURE: Enter valid ID");
			// No more responses
			responseObserver.onCompleted();
			throw new RuntimeException();

		}
		// Traversee devices to match ID
		while (i < items.size() && matchid != id) {
			matchid = items.get(i).getId();
			if (matchid == id) {
				// Alter matched device device info
				prepower = items.get(i).getPower();
				String str;
				if (prepower == false) {
					str = "{ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += "}  Powering on";
					Device change = Device.newBuilder().setId(items.get(i).getId()).setName(items.get(i).getName()).setPower(true).setIntensity((float) (0.0)).build();
					items.remove(i);
					items.add(change);	
				} else {
					str = "{ID: " + items.get(i).getId();
					str += " , Item: " + items.get(i).getName();
					str += "}  Powering off";
					Device change = Device.newBuilder().setId(items.get(i).getId()).setName(items.get(i).getName()).setPower(false).setIntensity((float) (0.0)).build();
					items.remove(i);
					items.add(change);	
					logger.info(str);
				}

				// Prepare return message with string of device info
				PowerResponseMessage reply = PowerResponseMessage.newBuilder().setItem(str).build();
				// Returning message to client
				responseObserver.onNext(reply);
				// Log message
				logger.info("SUCCESS: Power alteration complete");
				// No more responses
				responseObserver.onCompleted();
				break;
			}
			i++;
			// If id not in list
			if (i == items.size()) {
				PowerResponseMessage reply = PowerResponseMessage.newBuilder().setItem("FAILURE: No match for ID").build();
				responseObserver.onNext(reply);
				logger.info("FAILURE: No match for ID");
				// No more responses
				responseObserver.onCompleted();
				throw new RuntimeException();
			}
		}
	}

	// Intensity Method (Client Streaming)
	@Override
	public StreamObserver<IntensityRequestMessage> intensity(StreamObserver<IntensityResponseMessage> responseObserver) {

		return new StreamObserver<IntensityRequestMessage>() {
			// Variables for altering device intensity
			int id;
			float intensity;
			float preintensity;
			int count;
			int i = 0;
			int matchid;
			String[] attributes = new String[] { null, null };

			@Override
			public void onNext(IntensityRequestMessage item) {
				attributes[count] = item.getItem();
				count++;
			}

			@Override
			public void onCompleted() {
				try {
					// Values for altering recived from messages
					id = Integer.parseInt(attributes[0]);
					intensity = (Float.parseFloat(attributes[1])) / 100;
					while (i < items.size() && matchid != id) {
						matchid = items.get(i).getId();
						
						// Verifying inputs are valid for device creation
						if (matchid == id) {
							// If value exceeds range
							if (intensity < 0 || intensity > 1) {
								IntensityResponseMessage reply = IntensityResponseMessage.newBuilder()
										.setItem("FAILURE: Ensure intensity is within valid range").build();
								// Returning message to client
								responseObserver.onNext(reply);
								// Log message
								logger.info("FAILURE: Ensure intensity is within valid range");
								// No more responses
								responseObserver.onCompleted();
								throw new RuntimeException();
							}
							// If no ID entered
							if (attributes[0].equalsIgnoreCase("")) {
								IntensityResponseMessage reply = IntensityResponseMessage.newBuilder()
										.setItem("FAILURE: Enter ID of device to alter intensity").build();
								// Returning message to client
								responseObserver.onNext(reply);
								// Log message
								logger.info("FAILURE: Enter valid ID");
								// No more responses
								responseObserver.onCompleted();
								throw new RuntimeException();
							}
							// Alter matched device device info
							
							preintensity = items.get(i).getIntensity();
							String str;
							str = "{ID: " + items.get(i).getId();
							str += " , Item: " + items.get(i).getName();
							str += "}  Changing intensity from " + preintensity + " to " + intensity;
							if (intensity == 0) {
								Device change = Device.newBuilder().setId(items.get(i).getId()).setName(items.get(i).getName()).setPower(false).setIntensity((float)(intensity)).build();
								items.add(change);	
							} else {
								Device change = Device.newBuilder().setId(items.get(i).getId()).setName(items.get(i).getName()).setPower(true).setIntensity((float)(intensity)).build();
								items.add(change);	
							}
							items.remove(i);
							
							logger.info(str);
							responseObserver.onNext(IntensityResponseMessage.newBuilder().setItem(str).build());
							responseObserver.onCompleted();
							logger.info("SUCCESS: Device alteration complete");
							break;
						}
						i++;
					}
				} catch (NumberFormatException er) {
					logger.info(er.getMessage());
				}
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				logger.info(t.getLocalizedMessage());

			}
		};
	}
}