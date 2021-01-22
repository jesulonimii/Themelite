# ThemeLite

<img src="https://user-images.githubusercontent.com/77783694/105413416-593b9b00-5c36-11eb-9d34-7cc28ff5e10f.png">
A Java library for implementing dark theme easily in android apps.

# Features
* Easy Implentation
* Saves the theme even when app restart



# Implementation
### Step 1. Add this in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
### Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.erliteHq:themelite:1.1.0'
	}
	
### Step 3. Duplicate your Values folder in res and rename as "values-night" *(ignore the quote marks)*

### Step 4. In your colors-night xml file, set the corresponding dark theme colors for the colors in the colors xml file.
	
### Step 5. Create a Switch in your layout xml file.

### Step 6.  Add the following code to your activity.

```
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_###);

        //initialize ThemeLite
      themeLite = new ThemeLite(this);

      //declare
      darkSwitch = findViewById(R.id.darkSwitch);


      //set theme in splash or main activity
        themeLite.setTheme();

        //set switch state dependent on theme
        if (themeLite.getTheme == themeLite.dark){
            darkSwitch.setChecked(true);
        }

        //switch listener
        darkSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    themeLite.dark();
                } else {
                    themeLite.light();
                }

            }
        });


    }

    //save theme for app restart in closing activity
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        themeLite.saveTheme(this);

    }
  ```
 ### et Voila!

# Preview
<img src="https://user-images.githubusercontent.com/77783694/105400978-e5919200-5c25-11eb-8803-e020efaa5deb.png" width="40%">
<img src="https://user-images.githubusercontent.com/77783694/105400814-b713b700-5c25-11eb-9168-b8f010ec11fe.png" width="40%">

## psst..just a tip!
For smooth transitions between light mode and dark mode add this to your styles xml file
```
//Base Application theme
<style name="AppTheme" parent="Theme.AppCompat.Light.xxx">
...
...
 <item name="android:windowAnimationStyle">@style/WindowAnimationTransition</item>
</style>

<style name="WindowAnimationTransition">
        <item name="android:windowEnterAnimation">@android:anim/fade_in</item>
        <item name="android:windowExitAnimation">@android:anim/fade_out</item>
    </style>
```
Don't forget to add it to your styles-night file too!

