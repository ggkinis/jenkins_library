#!/usr/bin/groovy
def call(file_name) {
	stage ('Print file'){
		sh "cat ${file_name}"
	}
}
