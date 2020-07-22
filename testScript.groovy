def build() {
    echo "build number ${BUILD_NUMBER} in PROGRESS"
    echo "build in DONE"
}

def deploy() {
    echo "deploy in PROGRESS"
    echo " the VALUE IS ${VALUE}"
    echo "using server credentials ${CREDENTIALS}"
    echo "deploy in DONE"
}

return this