# JSON Generator
JSON generator is a command line application which is used to parse a special form of social media profile string to a
JSON string.

## Usage
You can input a profile string from keyboard, then application will print a JSON string respectively.
The sample form of string looks like this,
_profile|73241232|<Aamir><Hussain><Khan>|<Mumbai><<72.872075><19.075606>>|73241
232.jpg**followers|54543342|<Anil><><Kapoor>|<Delhi><<23.23><12.07>>|54543342.
jpg@@|12311334|<Amit><><Bansal>|<Bangalore><<><>>|12311334.jpg_

The produced JSON is here,
_{
    "id":"73241232",
    "name":{
        "first":"Aamir",
        "middle":"Hussain",
        "last":"Khan"
    },
    "location":{
        "name":"Mumbai",
        "coords":{
            "long":72.872075,
            "lat":19.075606
        }
    },
    "imageId":"73241232.jpg",
    "followers":[
        {
            "id":"54543342",
            "imageId":"54543342.jpg",
            "name":{
                "first":"Anil",
                "middle":"",
                "last":"Kapoor"
            },
            "location":{
            "name":"Delhi",
                "coords":{
                    "long":23.23,
                    "lat":12.07
                }
            }
        },
        {
            "id":"12311334",
            "imageId":"12311334.jpg",
            "name":{
                "first":"Amit",
                "middle":"",
                "last":"Bansal"
            },
            "location":{
                "name":"Bangalore",
                "coords":{
                    "long":"",
                    "lat":""
                }
            }
        }
    ]
}_


## Requirements
1. JDK 8
2. Maven


## Deployment
1. Build the project using maven goal `install` on pom.
2. Application jar will be present inside `target/` directory.
3. Run the executable jar using `java -jar application.jar`.