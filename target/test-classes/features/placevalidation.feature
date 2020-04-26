Feature: Validateing Place API's

Scenario: Verify place is being successfullly added using ADddPlaceAPI
	Given Add Place Payload
	When user calls "AddPlaceAPI" with posthttp request
	Then the API call is success with status code 200
	And "status" in response body is "ok"
	And "scope" in response body is "APP"