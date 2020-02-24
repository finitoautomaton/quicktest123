/*
 * Copyright (c) 2018. https://automationschool.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import geb.spock.GebReportingSpec
import pages.common.HomePage
import pages.base.BasePage
import spock.lang.Shared
import spock.lang.Stepwise

@Stepwise
class LoginLogoutSpec extends GebReportingSpec {
    @Shared cfg
    
    def setupSpec() {
        cfg = ConfigReader.getConfiguration()
        BasePage.config = cfg;
    }

    def cleanupSpec() {
    }

    def setup() {
        baseUrl = cfg.urlWithoutForwardSlash
    }

    def "JIRA-123*** Go to home page and click on about-us link"() {
        given: "You are on twitter homepage"
        to HomePage
        report("Home Page")
        HomePage homePage = at HomePage

        when: "You click on AboutUs link "
        homePage.clickOnAboutUs()

        then: "Check you are on about us page"
        report("About us Page")
    }

    def "JIRA-456*** Go to home page and click on about-us link 2"() {
        given: "You are on twitter homepage"
        to HomePage
        report("Home Page")
        HomePage homePage = at HomePage

        when: "You click on AboutUs link "
        homePage.clickOnAboutUs()

        then: "Check you are on about us page"
        false
    }
}