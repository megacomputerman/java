#!/bin/bash
find . -type f -name "*.java" > sources.txt
echo "=============================================================="
echo " Compiling..."
echo "=============================================================="
make clean
make
echo "=============================================================="
echo " Running..."
echo "=============================================================="
make run
