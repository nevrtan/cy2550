# Makefile

# Specify the Java source file and program name
JAVA_SRC = xkcdpwgen.java
PROGRAM_NAME = xkcdpwgen

# Shell script to run the Java program with arguments
RUN_SCRIPT = run_xkcdpwgen

.PHONY: all clean

all: $(PROGRAM_NAME) $(RUN_SCRIPT)

$(PROGRAM_NAME): $(JAVA_SRC)
	javac $(JAVA_SRC)

$(RUN_SCRIPT): $(PROGRAM_NAME)
	echo "#!/bin/bash" > $(RUN_SCRIPT)
	echo "java $(PROGRAM_NAME) \"\$$@\"" >> $(RUN_SCRIPT)
	chmod +x $(RUN_SCRIPT)

clean:
	rm -f $(PROGRAM_NAME) $(RUN_SCRIPT) *.class
