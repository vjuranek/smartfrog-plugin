#!/bin/bash
ssh -x $1 "export JAVA_HOME=\$JAVA_HOME; export PATH=\$JAVA_HOME/bin:\$JAVA_HOME/jre/bin:\$PATH; export SFHOME=$2; export SFUSERHOME=$3; export SFUSERHOME1=$4; export SFUSERHOME2=$5; export SFUSERHOME3=$6; export SFUSERHOME4=$7;${11}cd ${10}; $2/bin/sfStart $1 $9 $8"

