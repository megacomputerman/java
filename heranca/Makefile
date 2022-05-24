JFLAGS = -g
JC = javac
JVM= java
FILE=

.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Test.java \
	Pessoa.java \
	Aluno.java \
	Professor.java \

MAIN = Test

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
	
run: $(MAIN).class
	$(JVM) $(MAIN) $(FILE)

