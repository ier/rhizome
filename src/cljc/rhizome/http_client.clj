(ns rhizome.http-client
  (:require
   [hato.client :as hc]))

(defn get-data []
  (hc/get "https://api.stackexchange.com/2.2/search"
          {:query-params {:pagesize "100"
                          :order    "desc"
                          :sort     "creation"
                          :tagged   "clojure"
                          :site     "stackoverflow"}}))
