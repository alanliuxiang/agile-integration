#!/usr/bin/sh

oc delete deploymentconfigs mock-maximo-service
oc delete buildconfig mock-maximo-s2i
oc delete route maximo
oc delete service maximo
oc delete is mock-maximo

