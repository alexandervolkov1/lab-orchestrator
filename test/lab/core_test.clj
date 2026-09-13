(ns lab.core-test
  (:require [clojure.test :refer [deftest is]]
            [lab.core :as core]))

(deftest measurement-label-test
  (is (= "temperature: 723.5 deg. C"
         (core/measurement-label
          {:name "temperature"
           :value 723.5
           :unit "deg. C"}))))
