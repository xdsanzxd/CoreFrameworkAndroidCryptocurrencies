- CoreFramework Android Cryptocurrencies

- Technologies:
    *TestNG
    *Java
    *Selenium
    *Maven
    *Appium

- Complements
    -adb(Android Debug Bridge)
    -Appium Inspector. You online need put this capabilities into appium inspector to inspect any apk.
          JSON Representation
         {
           "app": "/Users/mtp/Downloads/Binance.apk",
           "deviceName": "Q6",
           "platformName": "android"
         }


-Steps:

    -1.- Connect your mobile devices in your computer.

    -2.- Active D
    -3.- Get the UDID of your mobiles with the next command.
         adb devices
         Then open TestNG file and put the result in "udid" parameter.

    -4.- Run TestNG.xml file
