(ns bullrocket.Models.kmeans-test
  (:require [clojure.test :refer :all]
            [bullrocket.Models.kmeans :refer :all]
            [incanter.core :as i])
  (:use [clojure.pprint]))

(deftest time-series-test
  (testing "test time series"
    (let [d (data-roll60 "test/bullrocket/data/KMeans-data/AA.csv")
          r (i/sel d :cols [:index :60day])
          _ (pprint r)]
      (is (= (i/nrow r) 193)))))
