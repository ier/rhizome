(ns rhizome.app
  (:require [rhizome.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
