JAVAC = javac
JAVA = java
SRC = xkcdpwgen.java
CLASS = xkcdpwgen.class

all: $(CLASS)

$(CLASS): $(SRC)
	$(JAVAC) $<
	


run: all
	$(JAVA) $(basename $(CLASS)) $(ARGS)
	

clean:
	rm -f $(CLASS)
	
.PHONY:
.DEFAULT_GOAL := run
