#!/usr/bin/groovy
def call() {
	stage ('Make file'){
		sh "date >> testfile"
	}
}
