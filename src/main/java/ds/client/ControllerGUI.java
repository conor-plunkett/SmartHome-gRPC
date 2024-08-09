package ds.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ds.service1.CreateRequestMessage;
import ds.service1.CreateResponseMessage;
import ds.service1.DeleteRequestMessage;
import ds.service1.DeleteResponseMessage;
import ds.service1.InspectRequestMessage;
import ds.service1.InspectResponseMessage;
import ds.service1.IntensityRequestMessage;
import ds.service1.IntensityResponseMessage;
import ds.service1.ListRequestMessage;
import ds.service1.ListResponseMessage;
import ds.service1.PowerRequestMessage;
import ds.service1.Service1;
import ds.service1.Service1Grpc;
import ds.service2.HumidifyRequestMessage;
import ds.service2.HumidifyResponseMessage;
import ds.service2.PresetRequestMessage;
import ds.service2.PresetResponseMessage;
import ds.service2.Service2Grpc;
import ds.service2.SetTemperatureRequestMessage;
import ds.service2.SetTemperatureResponseMessage;
import ds.service3.CameraRequestMessage;
import ds.service3.CameraResponseMessage;
import ds.service3.DimRequestMessage;
import ds.service3.DimResponseMessage;
import ds.service3.MotionRequestMessage;
import ds.service3.MotionResponseMessage;
import ds.service3.Service3Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class ControllerGUI implements ActionListener {

	private static final Logger logger = Logger.getLogger(Service1.class.getName());

	// Service 1
	private JTextField entryID, entryCreateID, entryCreateName, entryIntensityID, entryIntensityValue;
	// Service 2
	private JTextField entryTemperature, replyTemperature;
	// Service 3
	private JTextField entryMotionID, entryCameraID, entryDimnessValue;

	private JPanel getService1TitleJPanel() {

		JPanel panel = new JPanel();
		panel.add(Box.createRigidArea(new Dimension(5, 0)));

		JLabel label = new JLabel("Service 1 Methods");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		return panel;

	}

	private JPanel getService1AJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label1a = new JLabel("Enter Device ID");
		panel.add(label1a);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryID = new JTextField("", 10);
		panel.add(entryID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1a = new JButton("Inspect Device");
		button1a.addActionListener(this);
		panel.add(button1a);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1c = new JButton("Power Device");
		button1c.addActionListener(this);
		panel.add(button1c);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1b = new JButton("List Devices");
		button1b.addActionListener(this);
		panel.add(button1b);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1e = new JButton("Delete Device");
		button1e.addActionListener(this);
		panel.add(button1e);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;
	}

	private JPanel getService1BJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel labelCreateID = new JLabel("Enter Device ID");
		panel.add(labelCreateID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryCreateID = new JTextField("", 0);
		panel.add(entryCreateID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JLabel labelCreateName = new JLabel("Enter Device Name");
		panel.add(labelCreateName);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryCreateName = new JTextField("", 10);
		panel.add(entryCreateName);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Create Device");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService1CJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel labelIntensityID = new JLabel("Enter Device ID");
		panel.add(labelIntensityID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryIntensityID = new JTextField("", 0);
		panel.add(entryIntensityID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JLabel labelIntensityValue = new JLabel("Enter Intensity (1-100)");
		panel.add(labelIntensityValue);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryIntensityValue = new JTextField("", 10);
		panel.add(entryIntensityValue);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Alter Intensity");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2TitleJPanel() {

		JPanel panel = new JPanel();
		panel.add(Box.createRigidArea(new Dimension(5, 0)));

		JLabel label = new JLabel("Service 2 Methods");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		return panel;

	}

	private JPanel getService2AJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter Temperature");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryTemperature = new JTextField("", 10);
		panel.add(entryTemperature);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Set Temperature");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JLabel label2b = new JLabel("Current Temperature");
		panel.add(label2b);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		replyTemperature = new JTextField("", 10);
		replyTemperature.setEditable(false);
		panel.add(replyTemperature);

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2BJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JButton button = new JButton("Dehumidify Home");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton buttonb = new JButton("Event Preset");
		buttonb.addActionListener(this);
		panel.add(buttonb);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService3TitleJPanel() {

		JPanel panel = new JPanel();
		panel.add(Box.createRigidArea(new Dimension(5, 0)));

		JLabel label = new JLabel("Service 3 Methods");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		return panel;

	}

	private JPanel getService3AJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter Motion Sensor ID");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryMotionID = new JTextField("", 10);
		panel.add(entryMotionID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1a = new JButton("View Activity");
		button1a.addActionListener(this);
		panel.add(button1a);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;
	}

	private JPanel getService3BJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter Camera ID");
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryCameraID = new JTextField("", 10);
		panel.add(entryCameraID);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button1a = new JButton("Access Camera");
		button1a.addActionListener(this);
		panel.add(button1a);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;
	}

	private JPanel getService3CJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel labelDimnessValue = new JLabel("Enter Dimness Intensity (1-100)");
		panel.add(labelDimnessValue);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entryDimnessValue = new JTextField("", 10);
		panel.add(entryDimnessValue);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Alter Dimness");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		panel.setLayout(boxlayout);

		return panel;
	}

	private JPanel getPowerJPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JButton buttonOff1 = new JButton("Server 1 Shutdown");
		buttonOff1.addActionListener(this);
		panel.add(buttonOff1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton buttonOff2 = new JButton("Server 2 Shutdown");
		buttonOff2.addActionListener(this);
		panel.add(buttonOff2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton buttonOff3 = new JButton("Server 3 Shutdown");
		buttonOff3.addActionListener(this);
		panel.add(buttonOff3);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		panel.setLayout(boxlayout);

		return panel;

	}

	public static void main(String[] args) {

		ControllerGUI gui = new ControllerGUI();

		gui.build();
	}

	private void build() {

		JFrame frame = new JFrame("Service Controller Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

		panel.add(getService1TitleJPanel());
		panel.add(getService1AJPanel());
		panel.add(getService1BJPanel());
		panel.add(getService1CJPanel());
		panel.add(getService2TitleJPanel());
		panel.add(getService2AJPanel());
		panel.add(getService2BJPanel());
		panel.add(getService3TitleJPanel());
		panel.add(getService3AJPanel());
		panel.add(getService3BJPanel());
		panel.add(getService3CJPanel());
		panel.add(getPowerJPanel());

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		// Preset
		String degrees = "22";
		replyTemperature.setText(degrees.toString() + "°C");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String label = button.getActionCommand();

//		 ACCESS TO SERVICE1
		if (label.equals("Inspect Device") || label.equals("List Devices") || label.equals("Delete Device")
				|| label.equals("Create Device") || label.equals("Power Device") || label.equals("Alter Intensity")
				|| label.equals("Server 1 Shutdown")) {

			System.out.println("Service 1 to be invoked ...");

			// Port 50051 for Service 1
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

			// Stub generation - Service 1 blocking stub
			Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel).withDeadlineAfter(2,
					TimeUnit.SECONDS);

			// Channel shutdown
			if (label.equals("Server 1 Shutdown")) {
				try {
					System.out.println("Channel on port " + 50051 + " shutting down ...");
					channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS);
					System.out
							.println("50051 shutdown: " + channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS));
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

			// ACCESS TO DEVICE INSPECTION SERVICE (UNARY)
			if (label.equals("Inspect Device")) {

				// Preparing message to send
				// Ensure ID is entered
				if (entryID.getText().isEmpty()) {
					logger.info("ID validation failed");
					System.out.println("ERROR: Ensure valid ID is entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryID.getText().length();
				String input = entryID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}
				
				InspectRequestMessage request = InspectRequestMessage.newBuilder()
						.setId(Integer.parseInt(entryID.getText())).build();

				// Retreving reply from service
				try {
					// Stub generation - blocking stub
					InspectResponseMessage response = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS)
							.inspect(request);
					System.out.println(response.toString());
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

				// ACCESS TO LIST DEVICES SERVICE (SERVER STREAMING)
			} else if (label.equals("List Devices")) {

				// Preparing message to send
				ListRequestMessage request = ListRequestMessage.newBuilder().setInput("").build();

				// Retrieving replies from service
				try {
					// Create iterator to manage stream of responses
					Iterator<ListResponseMessage> ResponseStream;
					// Stub generation - blocking stub
					ResponseStream = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS).listdevicesconnected(request);

					// Print response stream when recieved
					int i = 1;
					for (i = 1; ResponseStream.hasNext(); i++) {
						// Listing devices incrementally
						ListResponseMessage ListResponseMessage = ResponseStream.next();
						System.out.println("Device " + i + " . " + ListResponseMessage.toString());
					}
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

				// ACCESS TO DELETE DEVICES (SERVER STREAMING)
			} else if (label.equals("Delete Device")) {

				// Ensure ID is entered
				if (entryID.getText().isEmpty()) {
					logger.info("ID validation failed");
					System.out.println("ERROR: Ensure valid ID is entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryID.getText().length();
				String input = entryID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}
			
				// Preparing message to send
				DeleteRequestMessage request = DeleteRequestMessage.newBuilder()
						.setId(Integer.parseInt(entryID.getText())).build();

				// Retrieving replies from service
				try {
					// Create iterator to manage stream of responses
					Iterator<DeleteResponseMessage> ResponseStream;
					// Stub generation - blocking stub
					ResponseStream = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS).delete(request);
					// Print response stream when recieved
					while (ResponseStream.hasNext()) {
						DeleteResponseMessage DeleteResponseMessage = ResponseStream.next();
						System.out.print(DeleteResponseMessage.toString());
					}
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

				// ACCESS TO CREATE SERVICES (CLIENT STREAMING)
			} else if (label.equals("Create Device")) {

				// Attributes recieved from GUI
				String[] attributes = new String[] { entryCreateID.getText(), entryCreateName.getText() };
				
				// Ensure ID is entered
				if (entryCreateID.getText().isEmpty() || entryCreateName.getText().isEmpty()) {
					logger.info("Attribute validation failed");
					System.out.println("ERROR: Ensure valid attributes are entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryCreateID.getText().length();
				String input = entryCreateID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}				

				// Handle responses
				StreamObserver<CreateResponseMessage> responseObserver = new StreamObserver<CreateResponseMessage>() {

					@Override
					public void onNext(CreateResponseMessage response) {
						logger.info("Creating device with input parameters " + response.getItem());
						System.out.println(response.getItem());
					}

					@Override
					public void onError(Throwable t) {
						logger.info("RPC failure");
						System.out.println(t.getMessage());
						throw new RuntimeException();
					}

					@Override
					public void onCompleted() {
						logger.info("Response recieved");
					}

				};

				// Stub generation - asynchronous
				Service1Grpc.Service1Stub asyncStub = Service1Grpc.newStub(channel).withDeadlineAfter(2,
						TimeUnit.SECONDS);
				StreamObserver<CreateRequestMessage> requestObserver = asyncStub.create(responseObserver);

				try {
					// Send both attributes
					logger.info("Sending device creation attributes");
					for (int i = 0; i < attributes.length; i++) {
						CreateRequestMessage attribute = CreateRequestMessage.newBuilder().setItem(attributes[i])
								.build();
						requestObserver.onNext(attribute);
					}
					// Exception handling
				} catch (RuntimeException er) {
					requestObserver.onError(er);
					throw er;
				}
				// No more messages
				requestObserver.onCompleted();

				// ACCESS TO POWER SERVICE (UNARY)

			} else if (label.equals("Power Device")) {
				
				// Ensure ID is entered
				if (entryID.getText().isEmpty()) {
					logger.info("ID validation failed");
					System.out.println("ERROR: Ensure valid ID is entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryID.getText().length();
				String input = entryID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}

				// Preparing message to send
				PowerRequestMessage request = PowerRequestMessage.newBuilder()
						.setId(Integer.parseInt(entryID.getText())).build();

				// Retreving reply from service
				try {
					// Stub generation - blocking stub
					ds.service1.PowerResponseMessage response = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS)
							.power(request);
					System.out.println(response.toString());
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

				// ACCESS TO ALTER INTENSITY SERVICE (CLIENT STREAMING)
			} else if (label.equals("Alter Intensity")) {
				// Attributes recieved from GUI
				String[] attributes = new String[] { entryIntensityID.getText(), entryIntensityValue.getText() };
				
				// Ensure ID is entered
				if (entryIntensityID.getText().isEmpty() || entryIntensityID.getText().isEmpty()) {
					logger.info("Attribute validation failed");
					System.out.println("ERROR: Ensure valid attributes are entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryIntensityID.getText().length();
				String input = entryIntensityID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}
				
				// Ensure intensity value is numeric
				int intensityLength = entryIntensityValue.getText().length();
				String inputIntensity = entryIntensityValue.getText();
				for (int i = 0; i < intensityLength; i++) {
					char c = (inputIntensity.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}
				
				
				// Handle responses
				StreamObserver<IntensityResponseMessage> responseObserver = new StreamObserver<IntensityResponseMessage>() {

					@Override
					public void onNext(IntensityResponseMessage response) {
						logger.info("Altering device with input parameters " + response.getItem());
						System.out.println(response.getItem());
					}

					@Override
					public void onError(Throwable t) {
						logger.info("RPC failure");
						System.out.println(t.getMessage());
						throw new RuntimeException();
					}

					@Override
					public void onCompleted() {
						logger.info("Response recieved");
					}

				};

				// Stub generation - asynchronous
				Service1Grpc.Service1Stub asyncStub = Service1Grpc.newStub(channel).withDeadlineAfter(2,
						TimeUnit.SECONDS);
				StreamObserver<IntensityRequestMessage> requestObserver = asyncStub.intensity(responseObserver);

				try {
					// Sends both attributes
					logger.info("Sending device alteration attributes");
					for (int i = 0; i < attributes.length; i++) {
						IntensityRequestMessage attribute = IntensityRequestMessage.newBuilder().setItem(attributes[i])
								.build();
						requestObserver.onNext(attribute);
					}
					// Exception handling
				} catch (RuntimeException er) {
					requestObserver.onError(er);
					throw er;
				}
				// No more messages
				requestObserver.onCompleted();
			}
		}
		// ACCESS TO SERVICE2
		else if (label.equals("Set Temperature") || (label.equals("Dehumidify Home")) || (label.equals("Event Preset"))
				|| label.equals("Server 2 Shutdown")) {

			System.out.println("Service 2 to be invoked ...");

			// Port 50052 for Service 2
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();

			// Stub generation - Service 2 blocking stub
			Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel).withDeadlineAfter(2,
					TimeUnit.SECONDS);

			// Channel shutdown
			if (label.equals("Server 2 Shutdown")) {
				try {
					System.out.println("Channel on port " + 50052 + " shutting down ...");
					channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS);
					System.out
							.println("50052 shutdown: " + channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS));
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

			// ACCESS TO SET TEMPERATURE SERVICE (SERVER STREAMING)
			if (label.equals("Set Temperature")) {

				// Ensure Temperature is entered
				if (entryTemperature.getText().isEmpty()) {
					logger.info("Temperature validation failed");
					System.out.println("ERROR: Ensure valid temperature is entered (whole integer)");
					return;
				}
				
				// Ensure Temperature is numeric
				int temperatureLength = entryTemperature.getText().length();
				String input = entryTemperature.getText();
				for (int i = 0; i < temperatureLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("Temperature numeric validation failed");
						System.out.println("ERROR: Ensure temperature is numeric");
						return;
					}
				}
				
				// Preparing message to send
				SetTemperatureRequestMessage request = SetTemperatureRequestMessage.newBuilder()
						.setDegree(Integer.parseInt(entryTemperature.getText())).build();

				// Flag for altering GUI display with first message
				boolean first = true;

				// Retrieving replies from service
				try {
					// Create iterator to manage stream of responses
					Iterator<SetTemperatureResponseMessage> ResponseStream;
					// Stub generation - blocking stub
					ResponseStream = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS).setTemperature(request);
					// Print response stream when recieved
					while (ResponseStream.hasNext()) {
						SetTemperatureResponseMessage SetTemperatureResponseMessage = ResponseStream.next();
						if (first == true) {
							// Isolate & format first response, verifying temperature change
							replyTemperature.setText(SetTemperatureResponseMessage.toString() + "°C");
							first = false;
						}
						System.out.print(SetTemperatureResponseMessage.toString());
					}
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

				// ACCESS TO DEHUMIDIFY SERVICE (BIDIRECTIONAL STREAMING)
			} else if (label.equals("Dehumidify Home")) {

				// Attributes for dehumidifyng home
				String[] attributes = new String[3];
				attributes[0] = "0";
				attributes[1] = ".78";
				attributes[2] = "1";

				// Handle responses
				StreamObserver<HumidifyResponseMessage> responseObserver = new StreamObserver<HumidifyResponseMessage>() {
					@Override
					public void onNext(HumidifyResponseMessage value) {
						System.out.println("Dehumidifying Complete: " + value.getItem());
					}

					@Override
					public void onError(Throwable t) {
						logger.info("RPC failure");
						System.out.println(t.getMessage());
						throw new RuntimeException();
					}

					@Override
					public void onCompleted() {
						logger.info("Response recieved");
					}
				};
				// Stub generation - asynchronous
				Service2Grpc.Service2Stub asyncStub = Service2Grpc.newStub(channel).withDeadlineAfter(2,
						TimeUnit.SECONDS);
				StreamObserver<HumidifyRequestMessage> requestObserver = asyncStub.dehumidify(responseObserver);

				try {
					// Sends both attributes
					logger.info("Sending device alteration attributes");
					for (int i = 0; i < attributes.length; i++) {
						HumidifyRequestMessage attribute = HumidifyRequestMessage.newBuilder().setItem(attributes[i])
								.build();
						requestObserver.onNext(attribute);
						System.out.println("Sending message containing atrribute " + (i + 1) + "/3: " + attributes[i]);
					}
					// Exception handling
				} catch (RuntimeException er) {
					requestObserver.onError(er);
					throw er;
				}
				// No more messages
				requestObserver.onCompleted();

				// ACCESS TO PRESET METHOD (BIDIRECTIONAL STREAMING)
			} else if (label.equals("Event Preset")) {

				// Attributes for preste
				String[] attributes = new String[8];
				attributes[0] = "true";
				attributes[1] = ".75";
				attributes[2] = "true";
				attributes[3] = "1";
				attributes[4] = "true";
				attributes[5] = "1";
				attributes[6] = "false";
				attributes[7] = "0.42";

				// Handle responses
				StreamObserver<PresetResponseMessage> responseObserver = new StreamObserver<PresetResponseMessage>() {

					@Override
					public void onNext(PresetResponseMessage value) {
						System.out.println("Preset activated: " + value.getItem());
					}

					@Override
					public void onError(Throwable t) {
						logger.info("RPC failure");
						System.out.println(t.getMessage());
						throw new RuntimeException();
					}

					@Override
					public void onCompleted() {
						logger.info("Response recieved");
					}
				};
				// Stub generation - asynchronous
				Service2Grpc.Service2Stub asyncStub = Service2Grpc.newStub(channel).withDeadlineAfter(2,
						TimeUnit.SECONDS);
				StreamObserver<PresetRequestMessage> requestObserver = asyncStub.preset(responseObserver);

				try {
					// Sends both attributes
					logger.info("Sending device alteration attributes");
					for (int i = 0; i < attributes.length; i++) {
						PresetRequestMessage attribute = PresetRequestMessage.newBuilder().setItem(attributes[i])
								.build();
						requestObserver.onNext(attribute);
						System.out.println("Sending message containing atrribute " + (i + 1) + "/8: " + attributes[i]);
					}
					// Exception handling
				} catch (RuntimeException er) {
					requestObserver.onError(er);
					throw er;
				}
				// No more messages
				requestObserver.onCompleted();
			}
			// ACCESS TO SERVICE 3
		} else if (label.equals("View Activity") || (label.equals("Access Camera")) || (label.equals("Alter Dimness"))
				|| label.equals("Server 3 Shutdown")) {

			System.out.println("Service 3 to be invoked ...");

			// Port 50053 for Service 3
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();

			// Stub generation
			Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel).withDeadlineAfter(2,
					TimeUnit.SECONDS);

			// Channel shutdown
			if (label.equals("Server 3 Shutdown")) {
				try {
					System.out.println("Channel on port " + 50053 + " shutting down ...");
					channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS);
					System.out
							.println("50053 shutdown: " + channel.shutdownNow().awaitTermination(3, TimeUnit.SECONDS));
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}

			// ACCESS TO MOTIONS SENSOR ACTIVITY (SERVER STREAMING)
			if (label.equals("View Activity")) {

				// Ensure ID is entered
				if (entryMotionID.getText().isEmpty()) {
					logger.info("ID validation failed");
					System.out.println("ERROR: Ensure valid ID is entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryMotionID.getText().length();
				String input = entryMotionID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}
				
				// Preparing message to send
				MotionRequestMessage request = MotionRequestMessage.newBuilder()
						.setId(Integer.parseInt(entryMotionID.getText())).build();

				// Retreving replies from service
				try {
					// Create iterator to manage stream of responses
					Iterator<MotionResponseMessage> ResponseStream;
					// Stub generation - blocking stub
					ResponseStream = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS).motion(request);
					// Print response stream when recieved
					while (ResponseStream.hasNext()) {
						MotionResponseMessage MotionResponseMessage = ResponseStream.next();
						System.out.print(MotionResponseMessage.toString());
					}
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

				// ACCESS TO CAMERAS VIEW (UNARY)
			} else if (label.equals("Access Camera")) {
								
				// Ensure ID is entered
				if (entryCameraID.getText().isEmpty()) {
					logger.info("ID validation failed");
					System.out.println("ERROR: Ensure valid ID is entered");
					return;
				}
				
				// Ensure ID is numeric
				int IDLength = entryCameraID.getText().length();
				String input = entryCameraID.getText();
				for (int i = 0; i < IDLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("ID numeric validation failed");
						System.out.println("ERROR: Ensure ID is numeric");
						return;
					}
				}
				
				// Preparing message to send
				CameraRequestMessage request = CameraRequestMessage.newBuilder()
						.setId(Integer.parseInt(entryCameraID.getText())).build();

				// Retreving reply from service
				try {
					// Stub generation - blocking stub
					CameraResponseMessage response = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS)
							.camera(request);
					System.out.println(response.toString());
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}

			} else if (label.equals("Alter Dimness")) {

				// Ensure intensity is entered
				if (entryDimnessValue.getText().isEmpty()) {
					logger.info("Intensity validation failed");
					System.out.println("ERROR: Ensure valid intensity is entered");
					return;
				}
				
				// Ensure ID is numeric
				int IntensityLength = entryDimnessValue.getText().length();
				String input = entryDimnessValue.getText();
				for (int i = 0; i < IntensityLength; i++) {
					char c = (input.charAt(i));
					boolean letter = Character.isLetter(c);
					if (letter == true) {
						logger.info("Intensity numeric validation failed");
						System.out.println("ERROR: Ensure intensity is numeric (whole integer)");
						return;
					}
				}
				
				// Preparing message to send
				DimRequestMessage request = DimRequestMessage.newBuilder()
						.setDimness(Float.parseFloat(entryDimnessValue.getText())).build();
				// Retreving reply from service
				try {
					// Create iterator to manage stream of responses

					Iterator<DimResponseMessage> ResponseStream;
					// Stub generation - blocking stub
					ResponseStream = blockingStub.withDeadlineAfter(2, TimeUnit.SECONDS).dim(request);
					// Print response stream when recieved
					while (ResponseStream.hasNext()) {
						DimResponseMessage DimResponseMessage = ResponseStream.next();
						System.out.print(DimResponseMessage.toString());
					}
					// Exception handling
				} catch (StatusRuntimeException er) {
					logger.info("RPC failed: " + er.getStatus());
					throw er;
				}
			}
		}
	}
}
