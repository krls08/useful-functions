#!/bin/bash

echo "========================"
echo "= Setup jdk8 with jenv ="
echo "========================"

echo "Links"
echo "https://www.jenv.be/"
echo "https://adoptopenjdk.net/"

#wget -q - https://github.com/AdoptOpenJDK/openjdk8-binaries/releases/download/jdk8u275-b01/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz -P ~/Documents
wget https://github.com/AdoptOpenJDK/openjdk8-binaries/releases/download/jdk8u275-b01/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz -P ~/Documents

tar -C Documents -xzf Documents/OpenJDK8U-jdk_x64_linux_hotspot_8u275b01.tar.gz

echo "Setup jenv"

git clone https://github.com/jenv/jenv.git ~/.jenv

#$ echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.bash_profile
#$ echo 'eval "$(jenv init -)"' >> ~/.bash_profile

echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.bash_profile
echo 'eval "$(jenv init -)"' >> ~/.bash_profile

source ~/.bash_profile

# echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.bashrc
# echo 'eval "$(jenv init -)"' >> ~/.bashrc

echo 'Add jdk to jenv'

jenv add ~/Documents/jdk8u275-b01

jenv local 1.8

echo "Add .bash_profile to sources:"
echo "$ source ~/.bash_profile"
