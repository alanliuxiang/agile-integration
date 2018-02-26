#!/usr/bin/sh

oc delete deploymentconfigs integration-hub
oc delete buildconfig integration-hub-s2i
oc delete route integration-hub
oc delete service integration-hub
oc delete is integration-hub

