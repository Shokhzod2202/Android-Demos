# ROS-based Autonomous Tracking and Video Recording on Android OS

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
## Table of Contents
- [Description](#description)
- [My Contributions](#my-contributions-to-the-group-project)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Description
This project implements ROS-based software modules for autonomous tracking, video recording, and communication with the smartphone's camera. The software utilizes computer vision algorithms for object tracking and integrates with Android APIs for camera control and communication. The goal is to enable autonomous tracking of objects, recording video footage, and remote control of the camera using a ROS framework.

## My Contributions to the Group Project:
* Hardware Construction
* Burning OS to the boards
* Building Android App with RosJava (in this Repo)

### Apps in this Repository:
- make_a_map app -> Map Making App
- map_manager -> Map Managing App
- map_nav -> Map Navigation App
- teleop -> Tele-operations App

## Development Plan
| # Weeks      |  Learned                                                                                                                                                                               |
| ---     |----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Week 1 | Introduction to Smart Mobility Service Course |
| Week 2 | Introduction to ROS |
| Week 3 | Configuring the ROS Development Environment |
| Week 4 | Important Concepts of ROS |
| Week 5 | ROS Commands |
| Week 6 | ROS tools |
| Week 7 | Basic Ros Programming |
| Week 8 | ROS Camera |
| Week 9 | ROS Sensor and Motor - Final Project Proposal Presentation |
| Week 10 | Navigation and Components |
| Week 11 | Service Robot |
| Week 12 | Manipulator |
| Week 13 | Special Topics |
| Week 14 | Android (Ros_Java) Learning |
| Week 15 | Android App with `ros_java` |



## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Installation

To set up the development environment and run this project, follow these steps:

1. Install ROS: Refer to the official ROS documentation for instructions on how to install ROS on your system.

2. Set up the Workspace: Create a ROS workspace using the `catkin_make` command.

3. Clone the Repository: Clone this repository into your ROS workspace.

4. Install Dependencies: Install any necessary dependencies for the project. Make sure you have the required ROS packages and other dependencies specified in the project's documentation.

5. Build the Workspace: Build the ROS workspace using the `catkin_make` command.


## Usage

To use the software modules for autonomous tracking, video recording, and communication with the smartphone's camera, follow these steps:

1. Configure ROS Nodes: Update the necessary configurations in the ROS nodes. Set up the object tracking algorithm, camera access, and communication with the mobile application. Refer to the project's documentation for detailed instructions.

2. Launch the Nodes: Launch the required ROS nodes using the appropriate launch files. Ensure that the camera node, tracking node, video recording node, and communication node are launched correctly.

3. Monitor Output: Monitor the ROS node output, log messages, and any visual feedback to verify the correct functioning of the software modules. Use tools like `rostopic echo` and `rostopic hz` to inspect topics and their data.

4. Test and Debug: Conduct thorough testing to validate the performance and reliability of the software modules. Debug any issues that arise, optimize the tracking algorithm if needed, and ensure smooth communication with the smartphone's camera.

## Contributing

Contributions to this project are welcome. To contribute, please follow these steps:

1. Fork the Repository.
2. Create a new branch for your feature or bug fix.
3. Make your modifications and commit the changes.
4. Push your changes to your forked repository.
5. Submit a pull request to the original repository.

Make sure to follow the project's coding conventions, maintain proper code documentation, and adhere to the guidelines specified in the project's CONTRIBUTING file.

## License

This project is licensed under the MIT License. See the [LICENSE](https://opensource.org/licenses/MIT) file for more information.

## Contact

For any questions, feedback, or inquiries, please contact:

- Khaydarov Shokhzod
- Email: shaxzodxaydarov257@gmail.com
- GitHub: [Shokhzod2202](https://github.com/Shokhzod2202/Android-Demos/tree/main/RosJavaApps)