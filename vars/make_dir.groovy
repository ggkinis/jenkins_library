#!/usr/bin/groovy
def call(workingDirectory) {
	stage ('Make dir'){
		sh "mkdir -p testdir"

		sh """
			mkdir goat
			rm -rf goat
		"""
	}
}
