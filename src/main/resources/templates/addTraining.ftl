<!DOCTYPE html>

<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/main.css"/>
    <script src="/js/jquery-3.2.0.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Training administration</h1>
    </div>
    <div class="row">
        <div class="col-md-2">
            <div class="panel-heading">
                <h3 class="panel-title">Training menu</h3>
            </div>
            <div class="panel-body">
                <ul class="nav nav-pills">
                    <li role="presentation" class="active">
                        <a href="/freemarker/training/add">
                            Add new training
                        </a>
                    </li>
                 <li role="presentation"><a href="#">List trainings</a></li>
                 </ul>
             </div>
         </div>
     </div>
     <div class="col-md-4">
     <h3>Add new training</h3>
     <from action"/freemarker/training/add" method="POST">
        <div class="from-gropu">
            <label for="clientId"> Client Id:</lebal>
            <input id="clientId" type="number" name="clientId" class="form-control">
        </div>

         <div class="from-gropu">
             <label for="birthDate"> Birth Date:</lebal>
             <input id="birthDate" type="date" name="birthDate" class="form-control">
         </div>

         <div class="from-gropu">
             <label for="timeOfTheDay"> Time Of The Day:</lebal>
             <input id="timeOfTheDay" type="date" name="timeOfTheDay" class="form-control">
         </div>

         <button type="submit" clas="btn btn-default">Save</button>
     </form>
     </div>
   </div>
</div>

</body>

</html>