/*
 * Copyright 2011-2014 Konstantinos Kostarellis.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * 
 * The Raphaël Javascript Library itself is licensed under the MIT License
 *      http://raphaeljs.com/license.html
 */
class RaphaelGrailsPlugin {
    // the plugin version (matches the version of the javascript library)
    def version = "2.1.2"
    def grailsVersion = "1.3 > *"
    def title = "Raphaël for Grails" // Headline display name of the plugin
    def author = "Konstantinos Kostarellis"
    def authorEmail = "kosta.grails@gmail.com"
    def description = '''\
Plugin that provides the JavaScript Vector Library Raphaël. Cross-browser vector graphics the easy way.
It integrates nicely with the resources plugin.
'''
    def documentation = "http://grails.org/plugin/raphael"

    def license = 'APACHE'
    def developers = [
        [name: "Konstantinos Kostarellis", email: "kosta.grails@gmail.com"]
    ]
    def issueManagement = [ system: "GITHUB", url: "https://github.com/delight/grails-raphael/issues" ]
    def scm = [ url: "https://github.com/delight/grails-raphael" ]
}
