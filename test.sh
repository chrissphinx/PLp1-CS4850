#!/usr/bin/env bash

for f in ../input/*; do echo -e "\033[33m$(basename $f)\033[0m:\033[1m"; java -jar ../dist/PLp1Initial.jar $f 2>/dev/null; echo -e "\033[0m"; done

