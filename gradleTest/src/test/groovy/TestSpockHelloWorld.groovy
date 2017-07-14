package de.gradlebuch
import spock.lang.*

class TestSpickHelloWorld extends Specification {
	def oUT
	def setup() { oUT = new HelloWorld()}
}

def "generate Greeting"() {
	def answer
	when: answer = oUt.generateGreetingsData()
	then: answer == "Hello World"
}

