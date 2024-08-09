# Smart Home System Simulated with gRPC & Local Ports (Java based)

This project simulates a smart home environment, using a mix of gRPC communication methods to control, alter and access devices throughout the property.
Local ports are used to simulate server connectivity.
A GUI controls the functionality of the environment, returning messages to the user through the console.

## Device Strucutre
Devices utilised in the methods are altered or returned dependent on the methods employed.
They contain the following parameters:

### Device
- ID
- Name
- Power
- Intensity

### Motion Sensor
- ID
- Name
- Power
- Last Activity Log 1
- Last Activity Log 2

### Camera
- ID
- Activity

## Services
Three services cover the core functionality of the application
1. Service 1 - Device Management
2. Service 2 - Climate Control
3. Service 3 - Privacy & Security

The gRPC messaging type utilised by each method indicated is indicated through the following legend:
Unary = U*
Server Streaming = S*
Client Streaming = C*
Bidirectional Streaming = B*

## Service 1 - Device Mangement
### CRUD 
- Create Device (C*): Enter Device ID and Device Name and click 'Create Device' to create device with relevant attribtues
- Inspect Device (U*): Enter Device ID and click 'Inspect Device' to inspect specific device attributes
- Alter Intensity (C*): Enter Device ID and Intensity and click 'Alter Intensity' to alter specific device intensity
- Power Device (U*): Enter Device ID and click 'Power Device' to power specific device on/off
- Delete Device (S*) : Enter Device ID and click 'Delete Device' to delete specific device

### List Devices
- List Devices (S*): Click 'List Devices' to list devices in the network

## Service 2 - Climate Control
### Set Temperature
- Set Temperature (S*): Enter desired temperature and click 'Set Temperature' to alter home temperature through automatic device alteration (base temperature 22C)

### Dehumidify Home
- Dehumidify Home (B*): Click 'Dehumidify Home' to engage preset settings for dehumidifying home
  - HVAC intensity decreased, AC intensity increased, Windows ventialtion on
    
### Preset Activation
- Set Preset (B*): Click 'Event Preset' to engage preset settings for event hosting
  - Speaker on & intensity increased, CCTV's on, Frontgate unlocked, Mainlight intensity lessened

## Service 3 - Privacy & Security
### Motion Sensor Activity
- View Activity (S*): Enter Motion Sensor ID and click 'View Activity' to return device information & activity logs

### Remote Camera Access
- Access Camera (U*): Enter Camera ID and click 'Access Camera' to access a camera

### Alter Window Dimness
- Alter Dimness (S*): Enter Dimness Intensity and click 'Alter Dimness' to change window dimness
  - Increase in window dimness resultingly lessens mainlight intensity
  - Decrease in window dimness resultingly lessens mainlight intensity

## Accessing Methods
All methods are accessed through the GUI.
Responses are returned to the console.

### Obtaining ID's
To obtain a device ID utilise the list functionality. 
Motion sensors begin at 1
Cameras begin at 201
Other devices begin at 100

### Intensity Units
Intensity is entered as a whole integer representing the percentage desired i.e. '70' = 70% intensity

## Shutdown
To close a channel select the 'Server X Shutdown' button on the GUI.
Returning true indicates successful shutdown of channel.

## Core Functioanlity
1. Device creation
2. Device inspection
3. Device powering
4. Device intensity alteration
5. Device deletion
6. Device listing
7. Temperature Control
8. Dehumidify Home
9. Event Preset
10. Motion Sensor Activity Log Access
11. Remote Camera Access
12. Dimness Alteration
13. Shutdown

Copyright 2024, Conor Plunkett
