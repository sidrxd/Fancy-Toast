# Fancy-Toast-by-soEpic

<h2>Step 1. Add the JitPack repository to your build file </h2>

gradle :-

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
<h2>Step 2. Add the dependency </h2>

	dependencies {
	         implementation 'com.github.sidrxd:Fancy-Toast:1.2'
	}
	
<h2>Usage: </h2>

        new FancyToast()
                .with(this) // context
                .setGravity(Gravity.BOTTOM,0,100) // gravity of FancyToast
                .setIcon(R.drawable.ic_round_group_work_24) // set custom icon resource
                .setText("Showing Show") // set text for FancyToast
                .cornerRadius(16) <p>// corner radius of FancyToast view
		.hideIcon(false) <p> // show/hide icon
                .show(); // finally show the FancyToast
                
    
