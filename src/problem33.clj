(ns problem33)

(def test-cases
  '[(= (__ [1 2 3] 2) '(1 1 2 2 3 3))
    (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))
    (= (__ [4 5 6] 1) '(4 5 6))
    (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))
    (= (__ [44 33] 2) [44 44 33 33])])

(def __
  (fn [seq n]
    (mapcat #(repeat n %) seq))
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
