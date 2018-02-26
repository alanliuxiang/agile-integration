#!/usr/bin/sh

oc delete deploymentconfigs target-queue
oc delete buildconfig target-queue-s2i
oc delete service target-queue
oc delete is target-queue

