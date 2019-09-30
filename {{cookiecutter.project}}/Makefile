# Project: {{cookiecutter.project}}
# Author: {{cookiecutter.author}}
# Date: {% now 'local', '%m/%d/%Y' %}

pkg={{cookiecutter.package}}

.PHONY: default 
default: run

.PHONY: run 
run:
	mill $(pkg).run
	mkdir -p generated/
	mv *.fir *.v *.anno.json generated/

.PHONY: compile
compile:
	mill $(pkg).compile

.PHONY: test 
test:
	mill $(pkg).test

.PHONY: clean
clean:
	mill clean
	rm -rf *.anno.json *.fir *.v generated/ out/ test_run_dir/
