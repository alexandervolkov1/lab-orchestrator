(ns lab.mock-test
  (:require [clojure.test :refer [deftest is]]
            [lab.mock :as mock]))

(deftest list-instruments-test
  (is (= [{:id :furnace-1
          :name "Training furnace"
          :kind :furnace}]
         (mock/list-instruments))))
