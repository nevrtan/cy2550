# Makefile

# Specify the Java source file and program name
JAVA_SRC = xkcdpwgen.java
PROGRAM_NAME = xkcdpwgen

# Shell script to run the Java program with arguments
RUN_SCRIPT = run_xkcdpwgen.sh

.PHONY: all run

all: $(JAVA_SRC)
	javac $(JAVA_SRC)

run: $(JAVA_SRC) $(RUN_SCRIPT)
	./$(RUN_SCRIPT) $(args)

$(RUN_SCRIPT): $(JAVA_SRC)
	echo "#!/bin/bash" > $(RUN_SCRIPT)
	echo "java $(PROGRAM_NAME) \"\$$@\"" >> $(RUN_SCRIPT)
	chmod +x $(RUN_SCRIPT)
