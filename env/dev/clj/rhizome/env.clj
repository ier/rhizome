(ns rhizome.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [rhizome.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[rhizome started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[rhizome has shut down successfully]=-"))
   :middleware wrap-dev})
