 // To adddress subprojects
 
 Configure projectA
    if (project.name == 'projectA') {
        tasks.jar {
            manifest {
                attributes(
                    'Main-Class': 'com.example.MainA', // Main class for projectA
                    'Class-Path': configurations.compileClasspath.collect { "lib/${it.name}" }.join(' ')
                )
            }
        }
    }

    // Configure projectB
    if (project.name == 'projectB') {
        tasks.jar {
            manifest {
                attributes(
                    'Main-Class': 'com.example.MainB', // Main class for projectB
                    'Class-Path': configurations.compileClasspath.collect { "lib/${it.name}" }.join(' ')
                )
            }
        }
    }
// Define dependencies for projectA
project(':projectA') {
    dependencies {
        implementation 'group:artifact:versionA' // Replace with projectA dependencies
        // Add more dependencies specific to projectA as needed
    }
}

// Define dependencies for projectB
project(':projectB') {
    dependencies {
        implementation 'group:artifact:versionB' // Replace with projectB dependencies
        // Add more dependencies specific to projectB as needed
    }
}
