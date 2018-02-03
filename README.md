# SampleAR(Markers)
This is simple sample Augmented Reality application with [AndAR Library](https://code.google.com/p/andar/).<br>
### AndAR Library
<em>AndAR is a project that enables Augmented Reality on the Android platform. The whole project is released under the GNU General Public License. This means you can freely use it in any of your projects, as long as you license them under the same license, this means the GPL.</em>

## Using SampleAR(Markers)

#### For using the app:
* Download the app <a target="_blank" href="https://github.com/Jamargle/SampleAR-Markers-/blob/master/app/build/outputs/apk/app-debug.apk?raw=true">here</a>.
* Allow installation of non-Market apps in Settings > Security
* Put this file into your Android device.
* Search app-debug.apk in your device and install it.
* Launch SampleAR(Markers) and focus your device to markers in any pdf file of this [folder](https://github.com/Jamargle/SampleAR-Markers-/tree/master/app/src/main/assets).

#### For using a new marker:
* Go to [Tarotaro blog](http://flash.tarotaro.org/blog/2009/07/12/mgo2/) and follow instructions from "How to use" section.
* Include your new .patt file in assets folder.
* Add the new object in MainActivity class with registerARObject().

#### For modifing SampleAR(Markers) or doing something with it follow these steps:
* Download the project from [here](https://github.com/Jamargle/SampleAR-Markers-/archive/master.zip).
* Unzip and go (in Android Studio) to File > New > Import project. Import the project.
* You have to use OpenGLRenderer (as CustomRenderer or similar) for nonAr processes and AndARActivity for AR tasks.

##### [AndAR Project](https://code.google.com/p/andar/) and [AndARLicense](http://www.gnu.org/licenses/gpl.html)
