# Makefile

# Specify the Java source file and program name
JAVA_SRC = xkcdpwgen.java
PROGRAM_NAME = xkcdpwgen

# Shell script to run the Java program with arguments
RUN_SCRIPT = run_xkcdpwgen

.PHONY: all clean

all: $(JAVA_SRC) $(RUN_SCRIPT)
	javac $(JAVA_SRC)
	echo "#!/bin/bash" > $(RUN_SCRIPT)
	echo "java $(PROGRAM_NAME) \"\$$@\"" >> $(RUN_SCRIPT)
	chmod +x $(RUN_SCRIPT)

clean:
	rm -f $(PROGRAM_NAME) $(RUN_SCRIPT) *.class
