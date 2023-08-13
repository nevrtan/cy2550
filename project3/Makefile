JAVAC = javac
JAVA = java
SRC = xkcdpwgen.java
CLASS = xkcdpwgen.class

all: $(CLASS)

$(CLASS): $(SRC)
	$(JAVAC) $<
	

clean:
	rm -f $(CLASS)
	
.PHONY:
.DEFAULT_GOAL := all
