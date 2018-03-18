(ns problem32)

(def test-cases
  '[(= (__ [1 2 3]) '(1 1 2 2 3 3))
    (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))
    (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))
    (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))])

(def __
  #(interleave % %)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
