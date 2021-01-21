# Themelite
A Java library for implementing dark theme easily in android apps.


# implementation
Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.erliteHq:themelite:1.0'
	}
	
Step 3. Duplicate your Values folder in res and rename as "values-night"

Step 4. In your colors xml file, set the corresponding dark theme colors.


