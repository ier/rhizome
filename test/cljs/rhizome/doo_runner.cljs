(ns rhizome.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [rhizome.core-test]))

(doo-tests 'rhizome.core-test)

