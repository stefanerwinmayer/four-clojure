(ns problem51)

(def test-cases
  '[(= [1 2 [3 4 5] [1 2 3 4 5]]
       (let [[a b & c :as d] __]
         [a b c d]))])

(def __
  [1 2 3 4 5]
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
