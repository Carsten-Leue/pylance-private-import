def buildInfo = bzSemantic(
        useAnalysisSonarQube: false,
        verbose: false,
        sonarQube: [
                useEE: true,
                failOnQualityGate: false
        ],
        slackChannel: 'zaas-ha-c14n-builds', 
        native: [
                kind    : 'python-package',
                contacts: [
                        "": [
                                moniker: "Carsten-Leue",
                                github : "TODO",
                                slack  : "TODO",
                                roles  : ["notify", "owner"]
                        ]
                ],
                docker  : false
        ]
)