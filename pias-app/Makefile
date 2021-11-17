JARNAME=pias-app
PO_UILIB_DIR=../../po-uilib
PO_PIAS_CORE_DIR=../../pias-core

all:
	(cd src; javac -cp $(PO_UILIB_DIR)/po-uilib.jar:$(PO_PIAS_CORE_DIR)/pias-core.jar -encoding UTF-8 `find . -name \*.java`)
	(cd src; jar cf ../$(JARNAME).jar `find . -name \*.class -o -name \*.java`)

clean:
	$(RM) $(JARNAME).jar `find . -name \*.class`
