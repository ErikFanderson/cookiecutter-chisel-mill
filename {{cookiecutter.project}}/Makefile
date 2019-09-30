# Project: {{cookiecutter.project}}
# Author: {{cookiecutter.author}}
# Date: {% now 'local', '%m/%d/%Y' %}

src={{cookiecutter.package}}

.PHONY: default 
default: run

.PHONY: run 
run:
	mill $(src).run

.PHONY: compile
compile:
	mill $(src).compile

