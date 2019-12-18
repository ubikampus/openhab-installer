# openHAB application for Android

[openHAB](https://www.openhab.org/ "openHAB") is a powerful and easy to use platform for developing IoT applications. It supports hundreds of devices and it can be extended with add-ons to provide, for example, database connections. The openHAB project does not provide application or support for the Android operating system. The openHAB application for Android, developed in the University of Helsinki, removes this shortcoming.

The application is based on [Termux ](https://github.com/termux/termux-app/ "Termux") (version 0.73) terminal emulator and Ubuntu distribution that can be run on Android devices. Termux, the Ubuntu distribution, and openHAB (version 2.5.0.M1) are all open source and can be used and modified freely. Termux is modified in a way that disables any other use than running openHAB. The main modifications are:
- The application starts on device boot.
- Only one session is allowed.
- The installation and running procedures on Termux start.
- Keyboard input is disabled.

Ubuntu is not modified, it is installed as it is with Termux ([termux-ubuntu/ubuntu.sh](https://github.com/Neo-Oli/termux-ubuntu/blob/master/ubuntu.sh)). After Ubuntu is installed and running, the application proceeds to install openHABs prerequisites and openHAB itself. All the installation related activities are done on the first run of the application. On subsequent runs the application only starts openHAB.

The application is not very useful, or safe to use, as it is. In theory, skilled users could create their own setup from scratch with it. However, this is not the intended use of the application. It is just the barebone version which is used for creating specific applications. Users install these separate, customized applications for different purposes. For example, to control lights or monitor freezer temperature.

openHABs has a REST API. With the API applications can have normal Android style user interface for controlling the devices. The API can also be used to create web-based user interface, if the application is web-oriented. Web based approach requires browser and might not be as straightforward to use as a self-contained application.

**LICENSE**

openHAB is licensed under [Eclipse Public License 2.0 | The Eclipse Foundation](https://www.eclipse.org/legal/epl-2.0/).

Termux is licensed under [the GPLv3 license](https://www.gnu.org/licenses/gpl.html).

Ubuntu is licensed under [GNU General Public License (GPL)](https://www.gnu.org/licenses).
