bin_PROGRAMS=TrainTarget
TrainTarget_SOURCES= \
	TrainTarget.cpp\
	TrainTargetMain.cpp

TrainTarget_CPPFLAGS=-I../include -I$(top_srcdir)/LIA_SpkTools/include -I$(ALIZE_PATH)/include
TrainTarget_LDFLAGS=-L$(top_srcdir)/lib -L$(ALIZE_PATH)/lib
TrainTarget_LDADD=-lliatools_${OS}_${ARCH}${DEBUG} $(lib_alize) $(LIBTHREAD)

all:
	mv ${bin_PROGRAMS} ${top_srcdir}/bin