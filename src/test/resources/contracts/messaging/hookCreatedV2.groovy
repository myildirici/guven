org.springframework.cloud.contract.spec.Contract.make {
	// Human readable description
	description 'Some description'
	// Label by means of which the output message can be triggered
	label 'hook_created_v2'
	// input to the contract
	input {
		// the contract will be triggered by a method
		triggeredBy('createHookV2()')
	}
	// output message of the contract
	outputMessage {
		// destination to which the output message will be sent
		sentTo 'messages'
		// the body of the output message
		body('''{"user":"dsyer","repo":"spring-cloud-samples","type":"hook","action":"updated"}''')
		// the headers of the output message
		headers {
			header('version', 'v2')
			header('contentType', applicationJson())
		}
	}
}
