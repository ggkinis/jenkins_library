#!/usr/bin/groovy
def call() {
	stage ('Make dir'){
		sh "mkdir -p testdir"

		sh """
			mkdir goat
			rm -rf goat
		"""
	}
}
