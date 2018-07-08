/**
 *  My Second Device Handler
 *
 *  Copyright 2018 NEZAR ALATTAR
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */


metadata {
	definition (name: "My Second Device Handler", namespace: "nez91", author: "NEZAR ALATTAR") {
		capability "Energy Meter"


	simulator {
		// TODO: define status and reply messages here
        	def name = "Your Name"

	// can omit the {} here
	def greeting = "Hello, $name"
	assert "Hello, Your Name" == greeting

	def person = [firstName: 'Walter', lastName: 'Sobchak']
	counsole "person"
	}

	}

	tiles {
		// TODO: define your main and details tiles here
	 
     }
}

// parse events into attributes
/*def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'energy' attribute

}*/