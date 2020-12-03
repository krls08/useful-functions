#!/bin/bash
printf "To make alias work, source the file:\n"
printf "=================================\n"
printf "= -> source tempAngularAlias.sh =\n"
printf "=================================\n"

var1="$(pwd)/node_modules/@angular/cli/bin/ng"
printf "$var1\n"
alias ngt="$(pwd)/node_modules/@angular/cli/bin/ng"
