# Project: {{cookiecutter.project}}
# Author: {{cookiecutter.author}}
# Date: {% now 'local', '%m/%d/%Y' %}

module={{cookiecutter.package}}

.PHONY: default 
default: run

.PHONY: run 
run:
	mill $(module).run
	mkdir -p generated/
	mv *.f *.fir *.v *.anno.json generated/

.PHONY: compile
compile:
	mill $(module).compile

.PHONY: test 
test:
	mill $(module).test

.PHONY: clean
clean:
	mill clean
	rm -rf *.anno.json *.fir *.v generated/ out/ test_run_dir/
